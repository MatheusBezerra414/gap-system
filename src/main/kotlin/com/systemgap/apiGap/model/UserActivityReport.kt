package com.systemgap.apiGap.model

import jakarta.persistence.*
import java.util.*

@Entity
@Table(name="activity_reports")
data class UserActivityReport(
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        val id: Long,
        @ManyToOne
        @JoinColumn(name = "user_id")
        @Column(nullable = false)
        val user: User,
        @Temporal(value = TemporalType.TIMESTAMP)
        @Column(name="date_created", nullable = false)
        var dateCreated: Date? = null,
        @Column(nullable = false)
        val totalOrder: Int,
        @Column(nullable = false)
        val emendas: Int,
        @Column(nullable = false)
        val pedidosRelatoria: Int,
        @Column(nullable = false)
        val votoEmSeparado: Int,
        @Column(nullable = false)
        val requerimentos: Int,
        @Column(nullable = false)
        val audienciaPublica: Int,
        @Column(nullable = false)
        val proposicoes: Int
){
        @PrePersist
        fun onCreate() {
                dateCreated = Date() // Define dateCreated para o momento atual antes de persistir
        }
}