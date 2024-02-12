package com.systemgap.apiGap.model

import jakarta.persistence.*

@Entity
@Table(name="law_project")
data class LawProject(
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        @Column(name="project_id")
        val id: String,
        @Column(nullable = false)
        val number: Int,

        @Column(nullable = false)
        val year: Int,

        @ManyToOne
        @JoinColumn(name="author_id")
        val projectAuthor: ProjectAuthor,

        @Column(nullable = false)
        val subject: String
)
