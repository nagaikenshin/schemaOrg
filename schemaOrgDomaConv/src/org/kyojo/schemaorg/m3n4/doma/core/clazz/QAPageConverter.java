package org.kyojo.schemaorg.m3n4.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.QA_PAGE;
import org.kyojo.schemaorg.m3n4.core.Clazz.QAPage;

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
