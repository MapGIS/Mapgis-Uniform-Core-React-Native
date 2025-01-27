package com.zondy.mapgis.mobile.geoanalysis

import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.bridge.ReactContextBaseJavaModule
import com.zondy.mapgis.analysis.spatialanalysis.OverlayOption

/**
 * @content 叠加类型
 * @author fangqi 2021-11-16
 */
class JSOverlayOptionOverlayType(context: ReactApplicationContext?) : ReactContextBaseJavaModule(context) {
  override fun getName(): String {
    return REACT_CLASS
  }

  override fun getConstants(): Map<String, Any>? {
    val constants: MutableMap<String, Any> = HashMap()
    val values = OverlayOption.OverlayType.values()
    for (i in values.indices) {
      val enumObj = values[i]
      constants[enumObj.name] = enumObj.name
    }
    return constants
  }

  companion object {
    private const val REACT_CLASS = "JSOverlayOptionOverlayType"
  }
}
