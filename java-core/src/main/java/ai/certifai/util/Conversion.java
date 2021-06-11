/*
 * Copyright (c) 2020-2021 CertifAI Sdn. Bhd.
 *
 * This program is part of OSRFramework. You can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version. You should have received a copy of the
 * GNU Affero General Public License along with this program.  If not, see
 *
 *       https://www.gnu.org/licenses/agpl-3.0
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 */
package ai.certifai.util;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class Conversion {

    public static String ListIntegerToString(List<Integer> list)
    {
        if((list == null) || list.isEmpty()) return "";

        StringBuilder strbul  = new StringBuilder();
        Iterator<Integer> iter = list.iterator();
        while(iter.hasNext())
        {
            strbul.append(iter.next());
            if(iter.hasNext()){
                strbul.append(" ");
            }
        }
        return strbul.toString();
    }

    public static List<Integer> StringToListInteger(String input)
    {
        return Arrays.stream(input.split(" ")).map(Integer::parseInt).collect(Collectors.toList());
    }

    public static List<String> StringToListString(String input)
    {
        return Arrays.stream(input.split(" ")).collect(Collectors.toList());
    }
}
