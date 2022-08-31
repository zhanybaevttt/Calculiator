import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("арифмитическое операция римских и арабских чисел : ");
       // System.out.println("пример:  сначало число +  пробель + ариф опер + пробел + второе чило + пролбель +  enter  ");
        try {

            int firstNumber = scanner.nextInt();
            String symbol = scanner.next();
            int lastNumber = scanner.nextInt();

            if (0 <= lastNumber && firstNumber <= 10) {
                if (Objects.equals(symbol, Character.toString('+'))) {
                    System.out.println(firstNumber+lastNumber);
                } else if (Objects.equals(symbol, Character.toString('-'))) {
                    System.out.println(firstNumber - lastNumber);
                } else if (Objects.equals(symbol, Character.toString('*'))) {
                    System.out.println(firstNumber * lastNumber);
                } else if (Objects.equals(symbol, Character.toString('/'))) {
                    System.out.println(firstNumber / lastNumber);
                }
            } else {
                System.out.println("Error");

            }
        } catch (Exception d) {
            int sum = 0;
            int sum1 = 0;
            String lastNumberR = scanner.next();
            String symbol = scanner.next();
            String firstNumberR = scanner.next();
            char[] chs = firstNumberR.toCharArray();
            char [] chs2 = lastNumberR.toCharArray();
            for (int i = 0; i < chs.length; i++) {
                if (chs[i] == 'I') {
                    sum += 1;
                }
                if (chs[i] == 'V') {

                    if (i != 0 && chs[i - 1] == 'I') {
                        sum += 4 - 1;
                    } else {
                        sum += 5;
                    }
                }

                if (chs[i] == 'X') {
                    if (i != 0 && chs[i - 1] == 'I') sum += 9 - 1;
                    else sum += 10;
                }
                if (chs[i] == 'L') {
                    if (i != 0 && chs[i - 1] == 'X') sum += 40 - 10;
                    else sum += 50;
                }
                if (chs[i] == 'C') {
                    if (i != 0 && chs[i - 1] == 'X') sum += 90 - 10;
                    else sum += 100;
                }
            }
            for (int j = 0; j < chs2.length; j++) {
                if (chs2[j] == 'I') {
                    sum1 += 1;
                }
                if (chs2[j] == 'V') {
                    {
                        if (j != 0 && chs[j - 1] == 'I') {
                            sum1 += 4 - 1;
                        } else {
                            sum1 += 5;
                        }
                    }

                }
                if (chs2[j] == 'X') {
                    if (j != 0 && chs2[j - 1] == 'I') sum1 += 9 - 1;
                    else sum1 += 10;
                }
                if (chs2[j] == 'L') {
                    if (j != 0 && chs2[j - 1] == 'X') sum1 += 40 - 10;
                    else sum1 += 50;
                }
                if (chs2[j] == 'C') {
                    if (j != 0 && chs2[j - 1] == 'X') sum1 += 90 - 10;
                    else sum1 += 100;
                }
            }
            if (0 <= sum && sum1 <= 10) {

                if (Objects.equals(symbol, Character.toString('+'))) {
                    int suma = sum + sum1;
                    System.out.println(RomanNunber.toROman(suma));
                } else if (Objects.equals(symbol, Character.toString('-'))) {
                    int ayyrma = sum1 - sum;
                    try {
                        System.out.println(RomanNunber.toROman(ayyrma));
                    }catch (NullPointerException e){
                        int b = sum - sum1;
                        System.out.println("-"+RomanNunber.toROman(b));
                    }
                } else if (Objects.equals(symbol, Character.toString('*'))) {
                    int koboi = sum * sum1;
                    System.out.println(RomanNunber.toROman(koboi));
                } else if (Objects.equals(symbol, Character.toString('/'))) {
                    int delie = sum / sum1;
                    System.out.println(RomanNunber.toROman(delie));
                }
            }
        }

        }
    }
