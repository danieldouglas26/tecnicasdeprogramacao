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
 * @brief Class Ex6
 */
public class Ex6 {

    public static void main(String[] args) {

        int x1 = 0, x2 = 0, y1 = 0, y2 = 0;
        double d = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe x1");
        x1 = scanner.nextInt();
        System.out.println("Informe y1");
        y1 = scanner.nextInt();
        System.out.println("Informe x2");
        x2 = scanner.nextInt();
        System.out.println("Informe y2");
        y2 = scanner.nextInt();

        d = Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2);

        System.out.println("Ponto 1: " + "(" + x1 + "," + y1 + ")");
        System.out.println("Ponto 2: " + "(" + x2 + "," + y2 + ")");
        System.out.println("Distância: " + d);
    }
}
