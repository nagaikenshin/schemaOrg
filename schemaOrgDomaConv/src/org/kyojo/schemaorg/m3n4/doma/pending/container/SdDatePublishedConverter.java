package org.kyojo.schemaorg.m3n4.doma.pending.container;

import java.sql.Date;
import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.pending.impl.SD_DATE_PUBLISHED;
import org.kyojo.schemaorg.m3n4.pending.Container.SdDatePublished;

@ExternalDomain
public class SdDatePublishedConverter implements DomainConverter<SdDatePublished, Date> {

	@Override
	public Date fromDomainToValue(SdDatePublished domain) {
		if(domain != null && domain.getDateList() != null && domain.getDateList().size() > 0) {
			return Date.valueOf(domain.getDateList().get(0).getDate());
		} else {
			return null;
		}
	}

	@Override
	public SdDatePublished fromValueToDomain(Date value) {
		return new SD_DATE_PUBLISHED(value);
	}

}
