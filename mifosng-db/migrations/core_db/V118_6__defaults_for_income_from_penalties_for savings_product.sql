/***Set defaults for income from Penalties for existing Saving Products**/
INSERT INTO `acc_product_mapping` (`gl_account_id`,`product_id`,`product_type`,`payment_type`,`charge_id`,`financial_account_type`)
select mapping.gl_account_id,mapping.product_id,mapping.product_type,mapping.payment_type,mapping.charge_id, 5
from acc_product_mapping mapping
where mapping.financial_account_type = 4 and mapping.product_type=2;