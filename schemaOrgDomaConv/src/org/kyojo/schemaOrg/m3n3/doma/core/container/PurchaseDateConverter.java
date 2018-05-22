package org.kyojo.schemaOrg.m3n3.doma.core.container;

import java.sql.Date;
import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.PURCHASE_DATE;
import org.kyojo.schemaOrg.m3n3.core.Container.PurchaseDate;

@ExternalDomain
public class PurchaseDateConverter implements DomainConverter<PurchaseDate, Date> {

	@Override
	public Date fromDomainToValue(PurchaseDate domain) {
		if(domain != null && domain.getDateList() != null && domain.getDateList().size() > 0) {
			return Date.valueOf(domain.getDateList().get(0).getDate());
		} else {
			return null;
		}
	}

	@Override
	public PurchaseDate fromValueToDomain(Date value) {
		return new PURCHASE_DATE(value);
	}

}
