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
 * @brief Class Ex15
 */
public class Ex15 {

    public static void main(String[] args) {
        int[][] matrizquad
                = {{20, 45, 75},
                {19, 76, 49},
                {10, 64, 70}};

        for (int i = 0; i < matrizquad.length; i++) {
            System.out.println(matrizquad[i][i]);
        }
    }
}
