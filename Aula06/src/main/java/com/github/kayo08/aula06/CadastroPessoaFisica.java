package com.github.kayo08.aula06;

/**
 * Programa que verifica validade de um determinado CPF atravez de
 * 2 algoritmos distintos que possui a mesma finalidade.
 *
 * @author Kayo Martins
 */
public class CadastroPessoaFisica {

    /**
     * Algoritmo que verifica se o CPF solicitado é valido, para isso ele tem
     * que retornar o 2 ultimos digitos do CPF.
     *
     * @param d Um vetor de 11 algoritmos que representam os digitos de um CPF.
     *
     * @return d que representa os 2 ultimos digitos do CPF caso seja valido,
     * ou retorna outro numero caso o CPF seja invalido.
     */
    public static int cpf(int d[]) {
        int sj, sk, j, k;
        if (d.length > 11 || d.length < 11) {
            throw new IllegalArgumentException("ERRO: Os digitos do CPF e maior ou menor que 11");
        }

        else {
            sj = d[0] + 2*d[1] + 3*d[2] + 4*d[3] + 5*d[4] + 6*d[5] + 7*d[6] + 8*d[7] + 9*d[8];

            sk = d[1] + 2*d[2] + 3*d[3] + 4*d[4] + 5*d[5] + 6*d[6] + 7*d[7] + 8*d[8] + 9*d[9];

            j = (sj % 11) % 10;

            k = (sk % 11) % 10;

            d[9] = j * 10;
            d[10] = k;
            d[0] = d[9] + d[10];
            
            return d[0];
        }
    }

    /**
     * Algoritmo que verifica se o CPF solicitado é valido, para isso ele tem
     * que retornar o 2 ultimos digitos do CPF.
     *
     * @param d Um vetor de 11 algoritmos que representam os digitos de um CPF.
     *
     * @return d que representa os 2 ultimos digitos do CPF caso seja valido,
     * ou retorna outro numero caso o CPF seja invalido.
     */
    public static int cpf2(int d[]) {
        int c = 7;
        int p = d[8];
        int s = d[8];
        int j, k;

        if (d.length > 11 || d.length < 11) {
            throw new IllegalArgumentException("ERRO: Os digitos dos CPF são maiores ou menores que 11");
        }

        else {
            while (c >= 0) {
                p = p + d[c];
                s = s + p;
                c--;
            }

            j = (s % 11) % 10;
            k = ((s - p + (9 * j)) % 11) % 10;

            d[9] = j * 10;
            d[10] = k;
            d[0] = d[9] + d[10];

            return d[0];
        }
    }
}