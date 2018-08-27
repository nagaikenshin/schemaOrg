package org.kyojo.schemaorg.m3n4.doma.core.container;

import java.sql.Date;
import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.UPLOAD_DATE;
import org.kyojo.schemaorg.m3n4.core.Container.UploadDate;

@ExternalDomain
public class UploadDateConverter implements DomainConverter<UploadDate, Date> {

	@Override
	public Date fromDomainToValue(UploadDate domain) {
		if(domain != null && domain.getDateList() != null && domain.getDateList().size() > 0) {
			return Date.valueOf(domain.getDateList().get(0).getDate());
		} else {
			return null;
		}
	}

	@Override
	public UploadDate fromValueToDomain(Date value) {
		return new UPLOAD_DATE(value);
	}

}
