package com.systemgap.apiGap.dto.req

import com.systemgap.apiGap.model.User
import com.systemgap.apiGap.model.UserActivityReport
import com.systemgap.apiGap.utils.Rule


data class UserActivityReportDTO(
    val userId: Long,
    val userName: String,
    val userEmail: String,
    val userRule: Rule,
    val userPhone: String,
    val totalOrder: Int,
    val emendas: Int,
    val pedidosRelatoria: Int,
    val votoEmSeparado: Int,
    val requerimentos: Int,
    val audienciaPublica: Int,
    val proposicoes: Int
){
    fun toEntity():UserActivityReport = UserActivityReport(
        user = User(
            name = this.userName,
            email = this.userEmail,
            rule = this.userRule,
            phone = this.userPhone
        ),
        totalOrder = this.totalOrder,
        emendas = this.emendas,
        pedidosRelatoria = this.pedidosRelatoria,
        votoEmSeparado = this.votoEmSeparado,
        requerimentos = this.requerimentos,
        audienciaPublica = this.audienciaPublica,
        proposicoes = this.proposicoes
    )
}
