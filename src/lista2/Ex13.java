/*
 * Copyright (C) 2024 Daniel Douglas <danieldouglas26@outlook.com>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package lista2;

import java.util.Scanner;

/**
 *
 * @author Daniel Douglas <danieldouglas26@outlook.com>
 * @date 28/02/2024
 * @brief Class Ex13
 */
public class Ex13 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int x, y, calc = 1;

        System.out.println("Informe o valor de X: ");
        x = scanner.nextInt();
        System.out.println("Informe o valor de Y: ");
        y = scanner.nextInt();

        for (int i = 1; i <= y; i++) {

            calc = calc * x;
        }
        System.out.println("");
        System.out.println(calc);

    }
}
