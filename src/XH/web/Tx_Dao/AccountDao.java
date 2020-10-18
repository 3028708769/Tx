package XH.web.Tx_Dao;

public interface AccountDao<arr> {
    /**
     * 汇款
     * @param outer
     * @param money
     */
    public void out(String outer ,Integer money);

    /**
     * 收款
     * @param inner
     * @param money
     */
    public void in(String inner ,Integer money);

}
