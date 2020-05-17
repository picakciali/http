/*
 * *
 *  * Created by Ali PIÇAKCI on 29.04.2020 01:19
 *  * Copyright (c) 2020 . All rights reserved.
 *  * Last modified 17.03.2020 20:41
 *
 */

package com.pck.httppck;

public interface Http {
    HttpRequest get(String url);
    HttpRequest post(String url);
    HttpRequest put(String url);
    HttpRequest delete(String url);
    HttpRequest request(String url, String method);
}
