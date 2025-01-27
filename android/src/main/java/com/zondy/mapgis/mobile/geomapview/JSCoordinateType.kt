package com.zondy.mapgis.mobile.geomapview

import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.bridge.ReactContextBaseJavaModule
import com.zondy.mapgis.utils.CoordinateType

class JSCoordinateType(context: ReactApplicationContext?) : ReactContextBaseJavaModule(context) {
  override fun getName(): String {
    return REACT_CLASS
  }

  override fun getConstants(): Map<String, Any>? {
    val constants: MutableMap<String, Any> = HashMap()
    val values = CoordinateType.values()
    for (i in values.indices) {
      val enumObj = values[i]
      constants[enumObj.name] = enumObj.name
    }
    return constants
  }

  companion object {
    private const val REACT_CLASS = "JSCoordinateType"
  }
}
