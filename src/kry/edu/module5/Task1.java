package kry.edu.module5;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;

/*
  @author   Vitalii Krykun
  @project   LabsSlovakia
  @class  Task1
  @version  1.0.0 
  @since 4/19/2021 - 18.04
*/
public class Task1 {

    private static Map<String, Integer> getMap(List<String> list) {
        Map<String, Integer> map = new HashMap<>();
        Integer value;
        for (String s : list) {
            if (!map.containsKey(s)) {
                map.put(s, 1);
            } else {
                value = map.get(s);
                map.put(s, value + 1);
            }
        }
        return map;
    }

    public static void main(String[] args) throws IOException {
        String text = new String(Files.readAllBytes(Paths.get("harry.txt")));

        text = text.toLowerCase().replaceAll("[^A-Za-z ]", "");
        String[] array = text.split(" +");
        List<String> list = Arrays.stream(array).collect(Collectors.toList());

        Map<String, Integer> map = getMap(list);
        Map<String, Integer> sortedMap = new LinkedHashMap<>();
        map.entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .forEachOrdered(entry -> sortedMap.put(entry.getKey(), entry.getValue()));

        //second part
        text = new String(Files.readAllBytes(Paths.get("harry.txt")));
        text = text.replaceAll("[^A-Za-z ]", "");
        String[] array1 = text.split(".");
        List<String> sentences = Arrays.stream(array1)
                .map(string -> string.substring(0, 1).toLowerCase()
                        + string.substring(1))
                .collect(Collectors.toList());
        list.clear();
        for (String sentence : sentences) {
            list.addAll(Arrays.asList(sentence.split(" +")));
        }
        array = text.split(" +");
        list = Arrays.stream(array).collect(Collectors.toList());
        map = getMap(list);
        Map<String, Integer> finalMap = map;
        List<String> properNamesList = list.stream()
                .distinct()
                .filter(entry -> !finalMap.containsKey(entry.toLowerCase()))
                .filter(entry -> Character.isUpperCase(entry.charAt(0)))
                .sorted()
                .collect(Collectors.toList());
        System.out.println("Proper names number: " + properNamesList.size());
        StringBuilder sb = new StringBuilder();
        sb.append("-----------SORTED PAIRS-----------").append("\n");
        sortedMap.entrySet().stream().limit(20).forEach(entry -> sb.append(entry).append('\n'));
        sb.append("-----------SORTED NAMES-----------").append("\n");
        properNamesList.stream().limit(20).forEach(name -> sb.append(name).append('\n'));
        Files.write(Paths.get("test.txt"), sb.toString().getBytes());
    }
    /*
        Proper names number: 1506
     */
    /*
        File output:
        -----------SORTED PAIRS-----------
        the=3628
        and=1919
        to=1856
        a=1688
        he=1528
        of=1259
        harry=1214
        was=1186
        it=1026
        in=964
        his=937
        you=863
        said=794
        had=702
        i=652
        on=636
        at=625
        that=601
        they=597
        as=526
        -----------SORTED NAMES-----------
        AAAAAAAAAARGH
        AAAARGH
        ALBUS
        ALLEY
        Aaah
        Aargh
        Abbott
        Absolutely
        According
        Adalbert
        Adrian
        Africa
        African
        Agrippa
        Ah
        Aha
        Ahem
        Ahern
        Alas
        Alberic
     */
}
