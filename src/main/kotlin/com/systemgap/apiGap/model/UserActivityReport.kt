package com.systemgap.apiGap.model

import jakarta.persistence.*
import java.io.Serializable
import java.util.*

@Entity
@Table(name="activity_reports")
data class UserActivityReport(
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        val id: Long? = null,

        @ManyToOne
        @JoinColumn(name = "user_id")
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
):Serializable{
        @PrePersist
        fun onCreate() {
                dateCreated = Date() // Define dateCreated para o momento atual antes de persistir
        }
}
