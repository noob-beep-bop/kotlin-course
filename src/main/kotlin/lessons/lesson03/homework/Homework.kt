import jdk.jshell.Snippet

// 1. Название мероприятия (неизменяемая публичная переменная известная на момент написания)
val name: String = "Monster Hackaton"

// 2. Дата проведения (публичная переменная известная на момент написания, но может быть изменена из-за переноса)
var date: String = "10 ноября 2025"

// 3. Дата проведения (публичная переменная известная на момент написания, но может быть изменена из-за переноса)
var place: String = "Moscow Tverskaya, 12"

// 4. Подробный бюджет мероприятия, включая расходы на оборудование, кейтеринг и другие операционные расходы. (приватная неизменяемая переменная - её не должны увидеть и бюджет уже запланирован и утверждён и не должен изменяться)
private val allBudget: String = "подробная информация с перечислением поставщиков и сумм для внутреннего пользования"

// 5. Количество участников
var number: Int = 100

// 6.Длительность хакатона
val days: Int = 3

// 7. Контактная информация и условия соглашений с поставщиками пищи, оборудования и других услуг.
val contacts_contracts: String by lazy {
    "These are our contacts and contracts."
}

// 8. Текущее состояние хакатона (статус)
lateinit var status: String

// 9. Cписок спонсоров
const val sponsors: String = "Our Sponsors"

// 10. Бюджет мероприятия
private var budget: double = 1000000.0

// 11. Текущий уровень доступа к интернету
lateinit var internet: String

// 12.Информация о транспортировке оборудования, распределении ресурсов и координации между различными командами поддержки.
private val transportInfo: String by lazy {
    "These are our info about transportation and such."
}

// 13.Количество команд
val teamNumber: int = 10

// 14.Перечень задач
val tasks: String by lazy {
    "These are our tasks."
}
 // 15. План эвакуации
val evacuation: String = "Evacuation info"

// 16. Список доступного оборудования (всё, что выделено для использования на мероприятии)
val allEquipment: String = "All equipment info"

//17. Список свободного оборудования (всё, что можно взять прямо сейчас и что не занято другими участниками)
val availableEquipment: String by lazy{
    "Equipment available now"
}
// 18. График питания участников (зависит от поставщика питания, определяемого за неделю до начала) (публичная изменяемая переменная с отложенной инициализацией, так как на момент создания поставщик и график не известны)
lateinit var mealSchedule: String

// 19. План мероприятий на случай сбоев
val emergencyPlan: String = "Evacuation info"

// 20. Список экспертов и жюри
val jury: String = "Jury and experts"

// 21. Политика конфиденциальности
val policy: String = "Policy and confidentiality"

// 22. Приватные отзывы (фидбэк) участников и зрителей для анализа проблем.
private lateinit var feedback: String

// 23. Текущая температура в помещении
lateinit var temperature: String

// 24. Данные мониторинга и анализ производительности сетевого оборудования и интернет-соединения для целей отладки своих приложений командами
val internetData: String by lazy {
    "Internet traffic and connection data"
}

// 25. Регулятор скорости интернета (понижающий коэффициент, например 0.5)
lateinit var internetRegulation: String

// 26. Уровень освещения
lateinit var lightning: String

// 27. Лог событий мероприятия
lateinit var  eventLog: String

// 28. Возможность получения медицинской помощи прямо на мероприятии (да/нет)
val medHelp: String = "Yes"


// 29. Планы и процедуры для обеспечения безопасности мероприятия, включая планы эвакуации и протоколы чрезвычайных ситуаций.
val safetyPlan: String = "Emergency and evacuation info"

// 30. Регистрационный номер мероприятия
val regisNumber: String = "Registration number of the event"


// 31. Максимально допустимый уровень шума в помещении хакатона.
val maxNoise: Int = 65

// 32. Индикатор превышения уровня шума в помещениях (превышен или не превышен в данный момент)
val explicitNoise: Int by lazy {
    66
}
// 33. План взаимодействия с прессой
val press: String = "Plan of interacting with the press"

// 34. Детальная публичная информация о проектах каждой команды, сбор данных включает в себя компиляцию кода и сбор статистики прогона автоматизированных проверок.
private val projectInfo: String = "Detailed project info"

// 35. Статус получения всех необходимых разрешений для проведения мероприятия
val permitStatus: String by lazy {
    "Status of all the necessary permissions "
}

// 36. Индикатор доступности специализированного оборудования в данный момент (например, специальному оборудованию)
val equipIndicator: String by lazy {
    "Yes or no"
}

// 37. Список партнеров мероприятия
val parnerList: String = "List of partners"

// 38. Отчет, включающий фотографии, видео и отзывы, генерируется и становится доступен после завершения мероприятия.
val report: String by lazy {
    "After event report"
}
// 39. Внутренние правила распределения призов
private val prizeRules: String = "Prize destribution rules"

// 40. Список разыгрываемых призов
val prises: String = "List of prises"

// 41. Контактная информация экстренных служб, медицинского персонала и других важных служб, для внутреннего пользования.
private val emergencyContacts: String = "Emergency Contacts"
e
// 42. Особые условия для участников с ограниченными возможностями
val specialRules: String = "Rules for people with special needs"

// 43. Общее настроение участников (определяется опросами)
val mood: String by lazy {
    "Overall participants mood"
}

// 44. Подробный план хакатона, включающий время и содержание каждого сегмента, инициализируется непосредственно перед началом мероприятия, так как зависит от фактического состава команд и взятых в работу задач.
lateinit var hackPlan: String

// 45. Имя знаменитого специального гостя, которое будет объявлено за день до мероприятия, но в момент инициализации неизвестно.
private val Celebrity: String = "Elon Musk"

// 46. Максимальное количество людей, которое может вместить место проведения.
const val maxAttendance: Int = 2500

// 47. Количество часов, отведенное каждой команде для работы над проектом.
val projectTime: Int = 72
