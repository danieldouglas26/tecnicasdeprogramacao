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
 * @brief Class Ex9
 */
public class Ex9 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int l1, l2, l3;
        String triang;

        System.out.println("Informe um lado do triângulo: ");
        l1 = scanner.nextInt();
        System.out.println("Informe um lado do triângulo: ");
        l2 = scanner.nextInt();
        System.out.println("Informe um lado do triângulo: ");
        l3 = scanner.nextInt();

        if (l1 == l2 && l1 == l3) {
            triang = "Equilatero";
        } else if (l1 == l2 || l2 == l3 || l1 == l3) {
            triang = "Isoceles";
        } else {
            triang = "Escaleno";
        }

        System.out.println(triang);
    }
}
