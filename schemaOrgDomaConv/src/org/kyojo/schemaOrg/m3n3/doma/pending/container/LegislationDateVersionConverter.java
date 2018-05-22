package org.kyojo.schemaOrg.m3n3.doma.pending.container;

import java.sql.Date;
import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.pending.impl.LEGISLATION_DATE_VERSION;
import org.kyojo.schemaOrg.m3n3.pending.Container.LegislationDateVersion;

@ExternalDomain
public class LegislationDateVersionConverter implements DomainConverter<LegislationDateVersion, Date> {

	@Override
	public Date fromDomainToValue(LegislationDateVersion domain) {
		if(domain != null && domain.getDateList() != null && domain.getDateList().size() > 0) {
			return Date.valueOf(domain.getDateList().get(0).getDate());
		} else {
			return null;
		}
	}

	@Override
	public LegislationDateVersion fromValueToDomain(Date value) {
		return new LEGISLATION_DATE_VERSION(value);
	}

}
