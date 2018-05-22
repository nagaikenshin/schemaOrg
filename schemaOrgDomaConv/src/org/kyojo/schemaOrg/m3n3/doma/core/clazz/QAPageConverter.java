package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.QA_PAGE;
import org.kyojo.schemaOrg.m3n3.core.Clazz.QAPage;

@ExternalDomain
public class QAPageConverter implements DomainConverter<QAPage, String> {

	@Override
	public String fromDomainToValue(QAPage domain) {
		return domain.getNativeValue();
	}

	@Override
	public QAPage fromValueToDomain(String value) {
		return new QA_PAGE(value);
	}

}
