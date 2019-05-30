/*
 * Copyright (c) 2017-2019 AutoDeploy AI
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.pmml4s.util


/**
 * Various utility methods about string conversions to different types.
 */
object StringUtils {

  def toInt(s: String): Option[Int] = try {
    Some(s.toInt)
  } catch {
    case e: NumberFormatException => None
  }

  def toInt(s: String, d: Int): Int = try {
    s.toInt
  } catch {
    case e: NumberFormatException => d
  }

  def toLong(s: String): Option[Long] = try {
    Some(s.toLong)
  } catch {
    case e: NumberFormatException => None
  }

  def toLong(s: String, d: Long): Long = try {
    s.toLong
  } catch {
    case e: NumberFormatException => d
  }

  def toFloat(s: String): Option[Float] = try {
    Some(s.toFloat)
  } catch {
    case e: NumberFormatException => None
  }

  def toFloat(s: String, d: Float): Float = try {
    s.toFloat
  } catch {
    case e: NumberFormatException => d
  }

  def toDouble(s: String): Option[Double] = try {
    Some(s.toDouble)
  } catch {
    case e: NumberFormatException => None
  }

  def toDouble(s: String, d: Double): Double = try {
    s.toDouble
  } catch {
    case e: NumberFormatException => d
  }

  def toBool(s: String): Option[Boolean] = try {
    Some(s.toBoolean)
  } catch {
    case e: Exception => None
  }

  def toBool(s: String, d: Boolean): Boolean = try {
    s.toBoolean
  } catch {
    case e: Exception => d
  }

}