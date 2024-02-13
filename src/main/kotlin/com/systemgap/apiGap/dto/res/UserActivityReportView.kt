package com.systemgap.apiGap.dto.res

import com.systemgap.apiGap.model.UserActivityReport
import com.systemgap.apiGap.utils.Rule

data class UserActivityReportView(
    val id: Long?,
    val userId: Long?,
    val userName: String,
    val totalOrder: Int,
    val emendas: Int,
    val pedidosRelatoria: Int,
    val votoEmSeparado: Int,
    val requerimentos: Int,
    val audienciaPublica: Int,
    val proposicoes: Int
){
    constructor(userActivityReport: UserActivityReport):this(
        id = userActivityReport.id,
        userId = userActivityReport.user.id,
        userName = userActivityReport.user.name,
        totalOrder = userActivityReport.totalOrder,
        emendas = userActivityReport.emendas,
        pedidosRelatoria = userActivityReport.pedidosRelatoria,
        votoEmSeparado = userActivityReport.votoEmSeparado,
        requerimentos = userActivityReport.requerimentos,
        audienciaPublica = userActivityReport.audienciaPublica,
        proposicoes = userActivityReport.proposicoes
    )
}
