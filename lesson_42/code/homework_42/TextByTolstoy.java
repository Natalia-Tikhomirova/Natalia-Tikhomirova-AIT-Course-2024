package homework_42;
// Подсчитайте частоту использования слов в предложении Л.Н.Толстого

import java.util.HashMap;
import java.util.Map;

public class TextByTolstoy {

    public static void main(String[] args) {

        String text = "В 1800-х годах, в те времена, когда не было еще ни железных, ни шоссейных дорог, ни газового, ни стеаринового света, ни пружинных низких диванов, ни мебели без лаку, ни разочарованных юношей со стеклышками, ни либеральных философов-женщин, ни милых дам-камелий, которых так много развелось в наше время, – в те наивные времена, когда из Москвы, выезжая в Петербург в повозке или карете, брали с собой целую кухню домашнего приготовления, ехали восемь суток по мягкой, пыльной или грязной дороге и верили в пожарские котлеты, в валдайские колокольчики и бублики, – когда в длинные осенние вечера нагорали сальные свечи, освещая семейные кружки из двадцати и тридцати человек, на балах в канделябры вставлялись восковые и спермацетовые свечи, когда мебель ставили симметрично, когда наши отцы были еще молоды не одним отсутствием морщин и седых волос, а стрелялись за женщин и из другого угла комнаты бросались поднимать нечаянно и не нечаянно уроненные платочки, наши матери носили коротенькие талии и огромные рукава и решали семейные дела выниманием билетиков, когда прелестные дамы-камелии прятались от дневного света, – в наивные времена масонских лож, мартинистов, тугендбунда, во времена Милорадовичей, Давыдовых, Пушкиных, – в губернском городе К. был съезд помещиков, и кончались дворянские выборы.";

        // Убираем знаки препинания и приводим текст к нижнему регистру
        text = text.replaceAll("[^a-zA-Zа-яА-Я\\s]", "").toLowerCase();

        String[] words = text.split("\\s+"); // разделяем текст на слова

        Map<String,Integer> wordFrequency = new HashMap<>();

        for (String word : words) {
            // Увеличиваем счетчик для каждого слова
            wordFrequency.put(word, wordFrequency.getOrDefault(word, 0) + 1);
        }

        // Вывод частоты
        for (Map.Entry<String, Integer> entry : wordFrequency.entrySet()) {
            System.out.println("Слово: " + entry.getKey() + " - частота использования: " + entry.getValue());
        }
    }
} // end of class