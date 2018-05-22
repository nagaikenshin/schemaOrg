package org.kyojo.schemaOrg.m3n3.doma.core.container;

import java.sql.Date;
import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.SCHEDULED_PAYMENT_DATE;
import org.kyojo.schemaOrg.m3n3.core.Container.ScheduledPaymentDate;

@ExternalDomain
public class ScheduledPaymentDateConverter implements DomainConverter<ScheduledPaymentDate, Date> {

	@Override
	public Date fromDomainToValue(ScheduledPaymentDate domain) {
		if(domain != null && domain.getDateList() != null && domain.getDateList().size() > 0) {
			return Date.valueOf(domain.getDateList().get(0).getDate());
		} else {
			return null;
		}
	}

	@Override
	public ScheduledPaymentDate fromValueToDomain(Date value) {
		return new SCHEDULED_PAYMENT_DATE(value);
	}

}
