package com.systemgap.apiGap.model

import com.systemgap.apiGap.utils.Rule
import jakarta.persistence.*
import jakarta.validation.constraints.Pattern
import java.io.Serializable

@Entity
@Table(name="users")
data class User(
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "user_id")
    val id: Long? = null,

    @Column(nullable = false)
    var name: String,

    @Column(nullable = false)
    var email: String,

    @Column(nullable = false)
    val password: String = "",

    @Column(nullable = false)
    var rule: Rule = Rule.LOBISTA,

    @Column(nullable = false)
    var phone: String,

    @OneToMany(cascade = [CascadeType.ALL],fetch = FetchType.EAGER, orphanRemoval = true)
    @OrderBy("date_created ASC")
    var activityReport: List<UserActivityReport>? = null,

    @OneToMany(cascade = [CascadeType.ALL],fetch = FetchType.LAZY, orphanRemoval = true)
    @OrderBy("date_project ASC")
    val projectMonitoring: List<ProjectMonitoring>? = null
):Serializable