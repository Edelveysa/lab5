package data;

import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.util.Objects;

public class HumanBeing
{

        private Long id; //Поле не может быть null, Значение поля должно быть больше 0, Значение этого поля должно быть уникальным, Значение этого поля должно генерироваться автоматически
        private String name; //Поле не может быть null, Строка не может быть пустой
        private Coordinates coordinates; //Поле не может быть null
        private java.time.LocalDateTime creationDate; //Поле не может быть null, Значение этого поля должно генерироваться автоматически
        private Boolean realHero; //Поле не может быть null
        private Boolean hasToothpick; //Поле может быть null
        private long impactSpeed; //Значение поля должно быть больше -621
        private String soundtrackName; //Поле не может быть null
        private Integer minutesOfWaiting; //Поле может быть null
        private Mood mood; //Поле может быть null
        private Car car; //Поле может быть null

        public HumanBeing(Long id, String name, Coordinates coordinates, Boolean realHero, Boolean hasToothpick,
                          long impactSpeed, String soundtrackName, Integer minutesOfWaiting, Mood mood, Car car)
        {
            setId(id);
            setCar(car);
            setName(name);
            setCoordinates(coordinates);
            setRealHero(realHero);
            setSoundtrackName(soundtrackName);
            setImpactSpeed(impactSpeed);
            setHasToothpick(hasToothpick);
            setMood(mood);
            setMinutesOfWaiting(minutesOfWaiting);
            setTime();

        }

        private LocalDateTime giveCreationTime()
        {
                return LocalDateTime.now();
        }

        public Mood getMood()
        {
                return mood;
        }

        public String getName()
        {
                return name;
        }

        public void setTime()
        {
            this.creationDate = giveCreationTime();
        }

        public long getImpactSpeed()
        {
                return impactSpeed;
        }

        public Coordinates getCoordinates()
        {
            return coordinates;
        }

        public Long getId()
        {
            return id;
            }

        public String getSoundtrackName()
        {
            return soundtrackName;
        }

        public void setId(Long id)
        {
            this.id = id;
        }

        public void setCoordinates(Coordinates coordinates)
        {
            if (coordinates == null) {
                    throw new NullPointerException("У вашего человека нет координат.");
            } else {
                    this.coordinates = coordinates;
            }
    }

        public void setName(String name)
        {
                if (name == null || name.equals(" ")) {
                        throw new NullPointerException("У вашего человека нет имени.");
                } else {
                        this.name = name;
                }
        }

        public void setRealHero(Boolean realHero)
        {
                if (realHero != null){
                        this.realHero = Boolean.valueOf(realHero);
                } else {
                        throw new NullPointerException("У вашего человека неизвестно, является ли он героем.");
                }
        }

        public void setHasToothpick(Boolean hasToothpick)
        {
                this.hasToothpick = hasToothpick;
        }

        public void setImpactSpeed(long impactSpeed)
        {
                this.impactSpeed = impactSpeed;
        }

        public void setSoundtrackName(String soundtrackName)
        {
                if (soundtrackName == null){
                        throw new NullPointerException("У вашего героя нет санудретка.");
                }else{
                        this.soundtrackName = soundtrackName;
                }
        }

        public void setMood(Mood mood)
        {
                this.mood = mood;
        }

        public void setCar(Car car)
        {
                this.car = car;
        }

        public void setMinutesOfWaiting(Integer minutesOfWaiting)
        {
            this.minutesOfWaiting = minutesOfWaiting;
        }

    @Override
    public String toString()
    {
        return "HumanBeing {" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", " + coordinates +
                ", creationDate=" + creationDate +
                ", realHero=" + realHero +
                ", hasToothpick=" + hasToothpick +
                ", impactSpeed=" + impactSpeed +
                ", soundtrackName='" + soundtrackName + '\'' +
                ", minutesOfWaiting=" + minutesOfWaiting +
                ", mood=" + mood +
                ", " +  car +
                "} \n";
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HumanBeing that = (HumanBeing) o;
        return impactSpeed == that.impactSpeed && Objects.equals(id, that.id) && Objects.equals(name, that.name) && Objects.equals(coordinates, that.coordinates) && Objects.equals(creationDate, that.creationDate) && Objects.equals(realHero, that.realHero) && Objects.equals(hasToothpick, that.hasToothpick) && Objects.equals(soundtrackName, that.soundtrackName) && Objects.equals(minutesOfWaiting, that.minutesOfWaiting) && mood == that.mood && Objects.equals(car, that.car);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(id, name, coordinates, creationDate, realHero, hasToothpick, impactSpeed, soundtrackName, minutesOfWaiting, mood, car);
    }
}
