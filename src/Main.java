// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        task6();
        task7();
        task8();
        }
    public static void task6 (){
        int a=12,b=27,c=44,d=15,e=9;
        int result=a*(b+(c-(d*e)));
        System.out.println(result);
        result = result * -1;
        System.out.println(result);
        result = result * -1;
        System.out.println(result);
    }
    public static void task7() {
        int a=5, b=7;
        a = a*b;
        b = a/b;
        a = a/b;
        System.out.println(a);
        System.out.println(b);
    }
    public static void task8(){
        int a = 764, b;
        a = (a/10)%10;
        b = a;
        System.out.println(b);
    }
    }
/**
 * Задача 6. Повышенная сложность.
 * 	Объявить целочисленные переменные a = 12, b = 27, c = 44, d = 15, e = 9.
 * 	Вычислить выражение a * (b + (c - d * e)) и присвоить его результат переменной result.
 * 	Инвертировать результат (значение в переменной result), преобразовав его в вариант с противоположным значением (отрицательное -> положительное, положительное -> отрицательное).
 * 	Вывести (напечатать) результат в консоль.
 *
 * 	Задача 7. Повышенная сложность.
 * 	Объявить целочисленные переменные a = 5 и b = 7. Добиться математическими манипуляциями того, чтобы a = 7 и b = 5.
 * 	Использовать дополнительные переменные запрещено.
 *
 * 	Задача 8. Повышенная сложность.
 * 	Объявить переменную a и инициализировать ее любым трехзначным числом.
 * 	Объявить переменную b и, путем математических операций над a получить и присвоить переменной b цифру, которая стоит в центре значения из переменной a.
 * 	Например, если a = 256, то необходимо с помощью математических действий достать цифру 5 из центра и присвоить переменной b. Если a = 789, то b должна быть инициализирована числом 8, так как эта цифра является вторым из трех (центральным) символом в значении a.
 * 	Следует учесть, что алгоритм должен быть универсальным и корректно срабатывать на любых трехзначных числах из a без изменений.
 * Это значит, что рассчитать в голове сумму, которую необходимо вычесть или прибавить к a для корректного значения в b нельзя, так как при каждом изменении значения в a её будет необходимо пересчитывать.
 */
