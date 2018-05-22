package org.kyojo.schemaOrg.m3n3.doma.core.container;

import java.sql.Date;
import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.UPLOAD_DATE;
import org.kyojo.schemaOrg.m3n3.core.Container.UploadDate;

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
