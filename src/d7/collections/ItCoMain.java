package d7.collections;

import java.util.*;

public class ItCoMain {
    public static void main(String[] args) {
        // ...전략
        // Collection
        List<String> listCollection = new ArrayList<>();
        Set<String> setCollection = new HashSet<>();
        // List의 Collection 메서드들
        System.out.println(listCollection.size());
        System.out.println(listCollection.isEmpty());
        System.out.println(listCollection.contains(""));
        System.out.println(listCollection.containsAll(setCollection));
        // Set의 Collection 메서드들
        System.out.println(setCollection.size());
        System.out.println(setCollection.isEmpty());
        System.out.println(setCollection.contains(""));
        System.out.println(setCollection.containsAll(listCollection));

        // Collection의 문서를 보면,
        // Collection 인터페이스를 구현하는 클래스는
        // 1. 아무것도 없는 기본 생성자와
        // 2. 다른 Collection을 받아 그 모든 원소를 가지는 생성자를
        // 만듦이 마땅하다
        List<String> listWithDuplicates = new ArrayList<>();
        listWithDuplicates.add("Java");
        listWithDuplicates.add("Java");
        listWithDuplicates.add("Java");
        listWithDuplicates.add("Java");
        Set<String> setNoDups = new HashSet<>(listWithDuplicates);
        System.out.println(setNoDups);
    }
}