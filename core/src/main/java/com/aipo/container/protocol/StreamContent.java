/*
 * Aipo is a groupware program developed by Aimluck,Inc.
 * Copyright (C) 2004-2015 Aimluck,Inc.
 * http://www.aipo.com
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.aipo.container.protocol;

import java.io.InputStream;

public class StreamContent {

  private InputStream inputStream;

  private String contentType;

  private int contentLength;

  public StreamContent(String contentType, InputStream is, int contentLength) {
    this.contentType = contentType;
    this.inputStream = is;
    this.contentLength = contentLength;
  }

  public StreamContent(String contentType, InputStream is) {
    this.contentType = contentType;
    this.inputStream = is;
  }

  public InputStream getInputStream() {
    return this.inputStream;
  }

  public String getContentType() {
    return this.contentType;
  }

  public int getContentLength() {
    return this.contentLength;
  }

  public void setInputStream(InputStream is) {
    this.inputStream = is;
  }

  public void setContentType(String contentType) {
    this.contentType = contentType;
  }

  public void setContentLength(int contentLength) {
    this.contentLength = contentLength;
  }
}