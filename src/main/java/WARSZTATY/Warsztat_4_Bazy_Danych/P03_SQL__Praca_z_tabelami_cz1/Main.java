package WARSZTATY.Warsztat_4_Bazy_Danych.P03_SQL__Praca_z_tabelami_cz1;

public class Main {
    public static void main(String[] args) {
        /*
        name        | rozmiar   | zakres                                | komentarz
        --------------------------------------------------------------------------------------
        boolean     | 1 byte    | false, true                           | może też być null
        --
        smallint    | 2 bytes   | -32768, 32767                         | integer o małym zakresie danych
        integer     | 4 bytes   | -2147483648, 2147483648               | najczęściej używany
        bigint      | 8 bytes   | ~ -9*10^18, ~ 9*10^18                 | integer o dużym zakresie danych
        real        | 4 bytes   | dokładność 6 cyfr dziesiętnych        | "the data types real ad double precision are inexact, variable-precision numeric types" nie używać do wartości precyzyjnych jak pieniędzy itp
        numeric(p,s)| zmienny   | Do 131072 cyfr przed przecinkiem oraz | "p"- ilość cyfr, "s"- ilość miejsc po przecinku
                    |           | do 16383 cyfr po przecinku            | numeric(5, 2) - to np.: 345.22 - używany do kalkulacji pieniężnych
                    |           | do 16383 cyfr po przecinku            | numeric(5, 2) - to np.: 345.22 - używany do kalkulacji pieniężnych
        --
        char(c)     |           |                                       | "n" - ilość znaków. Gdy podamy 10 a słowo ma 6 znaków reszta zostanie wypełniona spacjami. gdy słowo ma więcej niż 10 wystąpi błąd
        varchar(c)  |           |                                       | "n" - ilość znaków. Gdy podamy 10 a słowo ma 6 znaków reszta nie zostanie wypełniona spacjami gdy słowo ma więcej niż 10 wystąpi błąd
        text        |           |                                       | tekst o długości teoretycznie nieograniczonej
        --
        DATE        |           |                                       | przechowuje tylko datę
        TIME        |           |                                       | przechowuje tylko czas
        TIMESTAMP   |           |                                       | przechowuje datę i czas
        TIMESTAMP WITH TIME ZONE|                                       | przechowuje datę i czas z uwzględnieniem strefy czasowej

         */
    }
}
