package com.systemgap.apiGap.model

import com.systemgap.apiGap.utils.*
import java.util.Date

data class projectMonitoring(
        val id: String,
        val idUser: String,
        val date: Date,
        val topic: List<String>? = null,
        val projectHolder: ProjectHolder,
        val proposition: Proposition,
        val field: List<Field>,
        val project: LawProject,
        val isPriority: Boolean,
        val advice: Advice,
        val projectLink: String,
        val isRegistered: Boolean,
        val processing: List<String>,
        val appreciation: Appreciation,
        val status: String,


        )
