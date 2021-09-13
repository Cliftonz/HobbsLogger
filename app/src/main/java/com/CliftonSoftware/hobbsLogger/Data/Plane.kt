package com.CliftonSoftware.hobbsLogger.Data

data class Plane (val id: String,
                  val name: String,
                  val type: String,
                  val model: String,
                  val hasTach: Boolean,
                  val defaultPlane: Boolean,
                  val time: String, // remove
                  )