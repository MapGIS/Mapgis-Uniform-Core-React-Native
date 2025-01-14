package com.zondy.mapgis.mobile.geodatabase

import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.bridge.ReactContextBaseJavaModule
import com.zondy.mapgis.geodatabase.raster.RasterResampling

class JSRasterResampling(context: ReactApplicationContext?) : ReactContextBaseJavaModule(context) {
  override fun getName(): String {
    return REACT_CLASS
  }

  override fun getConstants(): Map<String, Any>? {
    val constants: MutableMap<String, Any> = HashMap()
    val values = RasterResampling.values()
    for (i in values.indices) {
      val enumObj = values[i]
      constants[enumObj.name] = enumObj.name
    }
    return constants
  }

  companion object {
    private const val REACT_CLASS = "JSRasterResampling"
  }
}
