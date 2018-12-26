package com.sneha.lamba;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestNews {

	public static void main(String[] args) {
		List<News> list = new ArrayList<News>();

		News news1 = new News(1, "sneha", "mahesh", "good");
		News news2 = new News(2, "jeevan", "bhakthi", "excellant");
		News news3 = new News(3, "kisan", "rahul", "satisfactory");
		News news4 = new News(4, "ram", "hanuman", "best");
		News news5 = new News(1, "shree", "sharan", "good");
		News news6 = new News(2, "sreeam", "sneha", "excellent");
		News news7 = new News(1, "shreekumar", "shanti", "good");
		News news8 = new News(3, "jungkook", "eunha", "excellant");
		News news9 = new News(2, "shreehari", "vidhya", "satisfactory");
		News news10 = new News(4, "jungkook", "sneha", "best");
		News news11 = new News(2, "hari", "vidhya", "good");

		list.add(news1);
		list.add(news2);
		list.add(news3);
		list.add(news4);
		list.add(news5);
		list.add(news6);
		list.add(news8);
		list.add(news9);
		list.add(news10);
		list.add(news11);

		Stream<News> stream1 = list.stream();
		Stream<News> stream2 = list.stream();

		
				stream1.map(a->a.getNewsId())
				.collect(Collectors.toList());
		//System.out.println(newsIdList);
		Map<News, Long> newsIdMap =
				stream1.collect(
                        Collectors.groupingBy(
                                Function.identity(), Collectors.counting()
                        )
                );
	}

}
