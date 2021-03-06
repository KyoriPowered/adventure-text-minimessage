/*
 * This file is part of adventure-text-minimessage, licensed under the MIT License.
 *
 * Copyright (c) 2018-2020 KyoriPowered
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package net.kyori.adventure.text.minimessage.parser;

/**
 * A type of token understood by the MiniMessage lexer.
 *
 * @since 4.1.0
 */
public enum TokenType {
  OPEN_TAG_START("<"),
  CLOSE_TAG_START("</"),
  TAG_END(">"),

  ESCAPED_OPEN_TAG_START("<"),
  ESCAPED_CLOSE_TAG_START("</"),

  PARAM_SEPARATOR(":"),

  SINGLE_QUOTE_START("'"),
  SINGLE_QUOTE_END("'"),
  DOUBLE_QUOTE_START("\""),
  DOUBLE_QUOTE_END("\""),

  STRING(""),
  NAME("");

  private final String value;

  TokenType(final String value) {
    this.value = value;
  }

  /**
   * Get the literal text matched by this token.
   *
   * @return token text
   * @since 4.1.0
   */
  public String value() {
    return this.value;
  }
}
