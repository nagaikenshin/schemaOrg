package org.kyojo.schemaOrg.m3n3.doma.healthLifesci.container;

import java.sql.Date;
import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.healthLifesci.impl.GUIDELINE_DATE;
import org.kyojo.schemaOrg.m3n3.healthLifesci.Container.GuidelineDate;

@ExternalDomain
public class GuidelineDateConverter implements DomainConverter<GuidelineDate, Date> {

	@Override
	public Date fromDomainToValue(GuidelineDate domain) {
		if(domain != null && domain.getDateList() != null && domain.getDateList().size() > 0) {
			return Date.valueOf(domain.getDateList().get(0).getDate());
		} else {
			return null;
		}
	}

	@Override
	public GuidelineDate fromValueToDomain(Date value) {
		return new GUIDELINE_DATE(value);
	}

}
