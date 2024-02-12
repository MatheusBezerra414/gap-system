package com.systemgap.apiGap.model

import com.systemgap.apiGap.utils.*
import jakarta.persistence.*
import java.io.Serializable
import java.util.*

@Entity
@Table(name = "project_monitoring")
data class ProjectMonitoring(
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    val id: Long,

    @ManyToOne
    @JoinColumn(name = "user_id")
    val user: User,

    @Column(name="date_project", nullable = false)
    val date: Date,

    var topic: List<String>? = null,

    @Column(nullable = false)
    val projectHolder: ProjectHolder,

    @Column(nullable = false)
    val proposition: Proposition,

    @Column(nullable = false)
    val field: List<Field>,

    @ManyToOne
    @JoinColumn(name = "project_id")
    val project: LawProject,

    @Column(nullable = false)
    var isPriority: Boolean = false,

    @Column(nullable = false)
    val advice: Advice,

    val projectLink: String,

    @Column(nullable = false)
    val isRegistered: Boolean = false,

    val processing: List<String>,

    @Column(nullable = false)
    val appreciation: Appreciation,

    @Column(nullable = false)
    val status: String,
) : Serializable
