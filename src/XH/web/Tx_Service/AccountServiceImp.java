package XH.web.Tx_Service;

import XH.web.Tx_Dao.AccountDao;
import org.springframework.transaction.support.TransactionTemplate;

public class AccountServiceImp implements AccountService {
    private AccountDao accountDao;
    private TransactionTemplate transactionTemplate;

    public void setTransactionTemplate(TransactionTemplate transactionTemplate) {
        this.transactionTemplate = transactionTemplate;
    }

    public void setAccountDao(AccountDao accountDao) {
        this.accountDao = accountDao;
    }

    @Override
    public void transfer(String outer, String inner, Integer money) {
//        transactionTemplate.execute(new TransactionCallbackWithoutResult() {
//            @Override
//            protected void doInTransactionWithoutResult(TransactionStatus transactionStatus) {
//                accountDao.out(outer,money);
//                //模拟断电情况
//                //int i =1/0;
//                accountDao.in(inner,money);
//            }
//        });
        accountDao.out(outer,money);
        //模拟断电情况
        int i =1/0;
        accountDao.in(inner,money);

    }
}
