package org.kyojo.schemaOrg.m3n3.doma.pending.container;

import java.util.Date;
import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.pending.impl.LEGISLATION_DATE;
import org.kyojo.schemaOrg.m3n3.pending.Container.LegislationDate;

@ExternalDomain
public class LegislationDateConverter implements DomainConverter<LegislationDate, Date> {

	@Override
	public Date fromDomainToValue(LegislationDate domain) {
		return domain.getNativeValue();
	}

	@Override
	public LegislationDate fromValueToDomain(Date value) {
		return new LEGISLATION_DATE(value);
	}

}
