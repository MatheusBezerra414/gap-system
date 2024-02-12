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
    var name: String?,
    @Column(nullable = false)
    var email: String?,
    @Column(nullable = false)
    var rule: Rule?,
    @Column(nullable = false)
    @Pattern(regexp = "^\\(\\d{2}\\)?[\\s-]?\\d{4,5}-?\\d{4}$", message = "Phone number must be in the format (XX) XXXX-XXXX or XXXX-XXXX")
    var phone: String?,
    @OneToMany(cascade = [CascadeType.ALL],fetch = FetchType.EAGER, orphanRemoval = true)
    @OrderBy("date_created ASC")
    var activityReport: List<UserActivityReport>? = null,
    @OneToMany(cascade = [CascadeType.ALL],fetch = FetchType.LAZY, orphanRemoval = true)
    @OrderBy("date_project ASC")
    val projectMonitoring: List<ProjectMonitoring>? = null
):Serializable