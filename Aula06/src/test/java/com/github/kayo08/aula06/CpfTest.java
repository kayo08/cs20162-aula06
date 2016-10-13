/*
 * Copyright (c) 2016. Kayo Martins Freitas
 */
package com.github.kayo08.aula06;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Kayo Martins
 */
public class CpfTest {

    @Test (expected = IllegalArgumentException.class)
    public void cpf12Digitos() {
        int v[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 1, 2, 3};

        CadastroPessoaFisica.cpf(v);
    }

    @Test (expected = IllegalArgumentException.class)
    public void cpf10Digitos() {
        int v[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 1};

        CadastroPessoaFisica.cpf(v);
    }

    @Test
    public void cpfValido() {
        //808.727.381-83
        int v[] = {8, 0, 8, 7, 2, 7, 3, 8, 1, 8, 3};

        assertEquals(83, CadastroPessoaFisica.cpf(v));
    }

    @Test
    public void cpfValido2() {
        //364.954.002-92
        int v[] = {3, 6, 4, 9, 5, 4, 0, 0, 2, 9, 2};

        assertEquals(92, CadastroPessoaFisica.cpf(v));
    }
}
