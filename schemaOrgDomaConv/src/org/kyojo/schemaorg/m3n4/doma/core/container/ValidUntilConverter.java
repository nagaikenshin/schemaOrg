package org.kyojo.schemaorg.m3n4.doma.core.container;

import java.sql.Date;
import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.VALID_UNTIL;
import org.kyojo.schemaorg.m3n4.core.Container.ValidUntil;

@ExternalDomain
public class ValidUntilConverter implements DomainConverter<ValidUntil, Date> {

	@Override
	public Date fromDomainToValue(ValidUntil domain) {
		if(domain != null && domain.getDateList() != null && domain.getDateList().size() > 0) {
			return Date.valueOf(domain.getDateList().get(0).getDate());
		} else {
			return null;
		}
	}

	@Override
	public ValidUntil fromValueToDomain(Date value) {
		return new VALID_UNTIL(value);
	}

}
