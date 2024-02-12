package com.systemgap.apiGap.model

import jakarta.persistence.*

@Entity
@Table(name="project_author")
data class ProjectAuthor(
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        @Column(name="author_id")
        val id: Long,

        @Column(nullable = false)
        val name: String,

        @Column(nullable = false)
        val cargo: String,

        val partido: String,

        val photo: String,

        @Column(nullable = false)
        val uf: String,

        @OneToMany(cascade = [CascadeType.ALL],fetch = FetchType.LAZY, orphanRemoval = false)
        @OrderBy("year ASC")
        val projects: List<LawProject>? = null
)
