IntStream для генерации делителей и noneMatch для проверки отсутствия делителей.

1. IntStream.range(2, number) — создается поток целых чисел от 2 до number - 1.

2. noneMatch(div -> number % div == 0) — проверяет, что ни одно число из этого потока не делит number нацело. 
Если ни одно число в диапазоне не делит number, значит number простое, и метод возвращает true.