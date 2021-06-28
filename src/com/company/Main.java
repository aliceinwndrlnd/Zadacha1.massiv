package com.company;

public class Main {

    public static void main(String[] args) {
/*
        1)Создайте массив из всех чётных чисел от 2 до 20 и выведите элементымассива на
        экран сначала в строку, отделяя один элемент от другого пробелом, а
        затем в столбик (отделяя один элемент от другого началом новой строки). Перед
        созданием массива подумайте, какого он будет размера.
 */
                int[] odds = new int[20];
                int j = 0;
                for (int i = 2; i <= 40; i = i + 2) {
                    odds[j] = i;
                    j++;
                }
                for (int odd : odds) {
                    System.out.print(odd + " ");
                }
                System.out.println();
                for (int odd : odds) {
                    System.out.println(odd);
                }
            }
        }
