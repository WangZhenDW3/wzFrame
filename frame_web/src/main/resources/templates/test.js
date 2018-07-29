/**
 * Created by wangzhen on 2018/6/8.
 */
function SYF_EPLC_CAL_CONF_BAL() {
    try {

        var nCONF_BAL; // Utility Auto Fix Comments
        var nCONF_PERCENT; // Utility Auto Fix Comments
        var nLC_BAL; // Utility Auto Fix Comments
        var nLIAB_BAL; // Utility Auto Fix Comments
        var nNO_PRD; // Utility Auto Fix Comments
        if (document.MAINFORM.OUR_ENG.value == "SILENT CONFIRMATION" || document.MAINFORM.OUR_ENG.value == "CONFIRMATION") {
            if (document.MAINFORM.CONF_PCT.value <= 0) {
                document.MAINFORM.CONF_PCT.value = 100;
            }
            nCONF_PERCENT = SYS_BeFloat(document.MAINFORM.CONF_PCT.value);
            nLC_BAL = SYS_BeFloat(document.MAINFORM.LC_BAL.value);
            nNO_PRD = SYS_BeInt(document.MAINFORM.NO_PRD.value) + 1;

            if (document.MAINFORM.REV_LC.value == 'YES') {
                if (document.MAINFORM.CUMULATIVE.value == 'Cumulative' || document.MAINFORM.EVERGREEN.value == 'YES') {
                    nCONF_BAL = SYS_BeFloat((nLC_BAL * nCONF_PERCENT) / 100 * nNO_PRD);
                    document.MAINFORM.CONF_BAL.value = SYT_AmtFormat(document.MAINFORM.LC_CCY.value, nCONF_BAL);
                    document.MAINFORM.LIAB_BAL.value = SYT_AmtFormat(document.MAINFORM.LC_CCY.value, nCONF_BAL);
                }
                if (document.MAINFORM.CUMULATIVE.value == 'Non Cumulative' && document.MAINFORM.EVERGREEN.value == 'NO') {
                    nCONF_BAL = SYS_BeFloat((nLC_BAL * nCONF_PERCENT) / 100); // Utility Auto Fix Comments
                    nLIAB_BAL = SYS_BeFloat((nLC_BAL * nCONF_PERCENT) / 100 * nNO_PRD);
                    document.MAINFORM.CONF_BAL.value = SYT_AmtFormat(document.MAINFORM.LC_CCY.value, nCONF_BAL);
                    document.MAINFORM.LIAB_BAL.value = SYT_AmtFormat(document.MAINFORM.LC_CCY.value, nLIAB_BAL);
                }
            } else {
                nCONF_BAL = SYS_BeFloat((nLC_BAL * nCONF_PERCENT) / 100); // Utility Auto Fix Comments
                document.MAINFORM.CONF_BAL.value = SYT_AmtFormat(document.MAINFORM.LC_CCY.value, nCONF_BAL);
                document.MAINF;
            }
        }
    }
}