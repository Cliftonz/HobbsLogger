package com.CliftonSoftware.hobbsLogger.Data

object DataProvider {

    val flightList = listOf(
        Flight("92a33eea-7812-4d32-bd08-ac9fd344108d", 1, 2.3),
        Flight("260e299b-00da-4367-95ff-f72e85246c06", 2, 1.7)
    )

    val planeList = listOf(
        Plane(
            id = "260e299b-00da-4367-95ff-f72e85246c06",
            name = "723AG",
            type = "DA40",
            model = "AFM",
            hasTach = true,
            defaultPlane = true,
            time = "3.4"
        ),
        Plane(
            id = "92a33eea-7812-4d32-bd08-ac9fd344108d",
            name = "UM312",
            type = "172",
            model = "M",
            hasTach = true,
            defaultPlane = false,
            time = "1.7"
        )
    )

}