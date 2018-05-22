package org.kyojo.schemaOrg.m3n3.doma.core.container;

import java.sql.Date;
import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.PRICE_VALID_UNTIL;
import org.kyojo.schemaOrg.m3n3.core.Container.PriceValidUntil;

@ExternalDomain
public class PriceValidUntilConverter implements DomainConverter<PriceValidUntil, Date> {

	@Override
	public Date fromDomainToValue(PriceValidUntil domain) {
		if(domain != null && domain.getDateList() != null && domain.getDateList().size() > 0) {
			return Date.valueOf(domain.getDateList().get(0).getDate());
		} else {
			return null;
		}
	}

	@Override
	public PriceValidUntil fromValueToDomain(Date value) {
		return new PRICE_VALID_UNTIL(value);
	}

}
