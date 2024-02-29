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

/**
 *
 * @author Daniel Douglas <danieldouglas26@outlook.com>
 * @date 28/02/2024
 * @brief Class Ex14
 */
public class Ex14 {

    public static void main(String[] args) {

        int primo = 0, cont = 0;

        for (int i = 2; i <= 1000; i++) {
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    primo++;
                }
            }
            if (primo == 2) {
                cont++;
                System.out.println("O número " + i + " é PRIMO!");
            }
            primo = 0;
        }
        System.out.println("");
        System.out.println("Número de primos contidos entre 1 e 1000 é " + cont);

    }
}
