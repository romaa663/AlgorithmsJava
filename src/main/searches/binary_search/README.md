БИНАРНЫЙ ПОИСК

Временная cложность алгоритма: О(log n)

Принцип:

1. Найти средний элемент предварительно отсортированного массива информации.
2. Сравнить значение элемента со значением, которое мы ищем (с ключом). Если он меньше среднего элемента, то поиск осуществляется в левой половине. В противном случае – в правой.
3. Когда ключ имеет такое же значение, что и средний элемент, происходит возврат индекса элемента. 
4. Шаги 2-3 выполняются до тех пор, пока не останется один объект.
5. Если ключ не был найден, то возвращается "-1".

Данный алгоритм поиска реализован в стандартном методе Arrays.binarySearch() класса java.util.Arrays.
